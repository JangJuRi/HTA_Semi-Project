package com.br.vo;

public class Pagenation {

	private int rowsPerPage;
	private int pagesPerBlock;
	private int pageNo;
	private int totalRows;
	private int totalPages;
	private int totalBlocks;
	private int currentBlock;
	private int beginIndex;
	private int endIndex;
	private int beginPage;
	private int endPage;
	
	public Pagenation(int rowsPerPage, int pagesPerBlock, int pageNo, int totalRows) {
		this.rowsPerPage = rowsPerPage;
		this.pagesPerBlock = pagesPerBlock;
		this.pageNo = pageNo;
		this.totalRows = totalRows;
		
		init();
	}
	
	private void init() {
		totalPages = (int) Math.ceil((double) totalRows/rowsPerPage);
		
		if (pageNo < 0 || pageNo > totalPages) {
			pageNo = 1;
		}
		beginIndex = (pageNo - 1)*rowsPerPage + 1;
		endIndex = pageNo*rowsPerPage;
		totalBlocks = (int) Math.ceil((double) totalPages/pagesPerBlock);
		currentBlock = (int) Math.ceil((double) pageNo/pagesPerBlock);
		beginPage = (currentBlock - 1)*pagesPerBlock + 1;
		endPage = currentBlock*pagesPerBlock;
		if (currentBlock == totalBlocks) {
			endPage = totalPages;
		}
	}
	
	public int getPageNo() {
		return pageNo;
	}
	
	public int getTotalPages() {
		return totalPages;
	}
	
	public int getBeginIndex() {
		return beginIndex;
	}
	
	public int getEndIndex() {
		return endIndex;
	}
	
	public int getBeginPage() {
		return beginPage;
	}
	
	public int getEndPage() {
		return endPage;
	}

	@Override
	public String toString() {
		return "Pagenation [rowsPerPage=" + rowsPerPage + ", pagesPerBlock=" + pagesPerBlock + ", pageNo=" + pageNo
				+ ", totalRows=" + totalRows + ", totalPages=" + totalPages + ", totalBlocks=" + totalBlocks
				+ ", currentBlock=" + currentBlock + ", beginIndex=" + beginIndex + ", endIndex=" + endIndex
				+ ", beginPage=" + beginPage + ", endPage=" + endPage + "]";
	}
	
	
}